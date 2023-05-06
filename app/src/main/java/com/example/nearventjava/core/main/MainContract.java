package com.example.nearventjava.core.main;

import com.example.nearventjava.base.BaseListenerContract;
import com.example.nearventjava.base.BasePresenterContract;
import com.example.nearventjava.base.BaseViewContract;
import com.example.nearventjava.model.User;

public interface MainContract {
    interface View extends BaseViewContract {
        void requireLogin();

        void setUser(User username);

        void setEmail(String email);
    }

    interface Presenter extends BasePresenterContract {
        void checkIfUserIsLoggedIn();
        void onDrawerOptionLogoutClick();
    }

    interface Interactor {
        void performGetUserData();

        void performLogout();
    }

    interface Listener extends BaseListenerContract {
        void onSuccess(User user);

        void onFailure();
    }
}
