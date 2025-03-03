package redis.embedded;

import java.util.ArrayList;
import java.util.List;

public class RedisSentinel extends AbstractRedisInstance {
    private static final String REDIS_READY_PATTERN = ".*Sentinel (runid|ID) is.*";

    public RedisSentinel(List<String> args, int port) {
        super(port, new ArrayList<>(args));
    }

    @Override
    protected String redisReadyPattern() {
        return REDIS_READY_PATTERN;
    }

    public static RedisSentinelBuilder builder() {
        return new RedisSentinelBuilder();
    }
}
