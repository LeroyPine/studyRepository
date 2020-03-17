package com.leroy.practice.model;

import java.util.List;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author luobs
 * @version 1.0
 * @date Created in 2019年08月20日 16:29
 * @since 1.0
 */
public class PR {

    private List<User>  users;

    private List<String>  as;

    public List<String> getAs() {
        return as;
    }

    public void setAs(List<String> as) {
        this.as = as;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
