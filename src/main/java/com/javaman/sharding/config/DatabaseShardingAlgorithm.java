package com.javaman.sharding.config;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.SingleKeyDatabaseShardingAlgorithm;
import com.google.common.collect.Range;
import com.javaman.sharding.datasource.Database0Config;
import com.javaman.sharding.datasource.Database1Config;
import com.javaman.sharding.datasource.Database3Config;
import com.javaman.sharding.datasource.Database4Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * 这里使用的都是单键分片策略
 * 示例分库策略是：
 * GoodsId<=20使用database0库
 * 其余使用database1库
 */
@Component
public class DatabaseShardingAlgorithm implements SingleKeyDatabaseShardingAlgorithm<Long> {

    @Autowired
    private Database0Config database0Config;
    @Autowired
    private Database1Config database1Config;
    @Autowired
    private Database3Config database3Config;
    @Autowired
    private Database4Config database4Config;

    @Override
    public String doEqualSharding(Collection<String> availableTargetNames, ShardingValue<Long> shardingValue) {
        Long value = shardingValue.getValue();
        int hashCode = Math.abs(Objects.hashCode(Math.abs(value)));
        int index = hashCode % 4;
        switch (index) {
            case 0:
                return database0Config.getDatabaseName();
            case 1:
                return database1Config.getDatabaseName();
            case 2:
                return database3Config.getDatabaseName();
            case 3:
                return database4Config.getDatabaseName();
            default:
                return null;
        }
    }

    @Override
    public Collection<String> doInSharding(Collection<String> availableTargetNames, ShardingValue<Long> shardingValue) {
        Collection<String> result = new LinkedHashSet<>(availableTargetNames.size());
        for (Long value : shardingValue.getValues()) {
            int hashCode = Objects.hashCode(Math.abs(value));
            int index = hashCode % 4;
            switch (index) {
                case 0:
                    result.add(database0Config.getDatabaseName());
                    break;
                case 1:
                    result.add(database1Config.getDatabaseName());
                    break;
                case 2:
                    result.add(database3Config.getDatabaseName());
                    break;
                case 3:
                    result.add(database4Config.getDatabaseName());
                    break;
                default:
                    return null;
            }
        }
        return result;
    }

    @Override
    public Collection<String> doBetweenSharding(Collection<String> availableTargetNames,
                                                ShardingValue<Long> shardingValue) {
        Collection<String> result = new LinkedHashSet<>(availableTargetNames.size());
        Range<Long> range = shardingValue.getValueRange();
        for (Long value = range.lowerEndpoint(); value <= range.upperEndpoint(); value++) {
            int hashCode = Objects.hashCode(Math.abs(value));
            int index = hashCode % 4;
            switch (index) {
                case 0:
                    result.add(database0Config.getDatabaseName());
                    break;
                case 1:
                    result.add(database1Config.getDatabaseName());
                    break;
                case 2:
                    result.add(database3Config.getDatabaseName());
                    break;
                case 3:
                    result.add(database4Config.getDatabaseName());
                    break;
                default:
                    return null;
            }
        }
        return result;
    }
}