package rj7.vo;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by 隽 on 2016/12/16.
 */
public class UserCus {
    private User user;
    private List<User> users;
    private Map<String,Object> map=new HashMap<>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
