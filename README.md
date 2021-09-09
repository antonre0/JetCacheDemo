# jetcache
https://github.com/alibaba/jetcache/wiki/Home_CN

本地缓存 redis缓存
```
public interface UserService {
    @Cached(name="userCache.", key="#userId", expire = 3600)
    User getUserById(long userId);

    @CacheUpdate(name="userCache.", key="#user.userId", value="#user")
    void updateUser(User user);

    @CacheInvalidate(name="userCache.", key="#userId")
    void deleteUser(long userId);
}
```

