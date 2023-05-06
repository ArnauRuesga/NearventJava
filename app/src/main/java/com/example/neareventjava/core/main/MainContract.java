package com.example.neareventjava.core.main;

import com.example.neareventjava.base.BaseListenerContract;
import com.example.neareventjava.base.BasePresenterContract;
import com.example.neareventjava.base.BaseViewContract;
import com.example.neareventjava.model.User;

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
