package com.fengmaster.lifegameserver.infrastructure.common.util;

import com.fengmaster.lifegameserver.domain.model.entity.LgUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

public class UserUtil {

    public static LgUser getCurrentUser() {

        LgUser user = (LgUser) getSession().getAttribute("login_user");

        return user;
    }

    public static void setUserSession(LgUser user) {
        getSession().setAttribute("login_user", user);
    }

    private static Session getSession() {
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        return session;
    }

}
