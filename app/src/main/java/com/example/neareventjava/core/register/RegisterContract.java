package com.example.neareventjava.core.register;

import com.example.neareventjava.base.BaseListenerContract;
import com.example.neareventjava.base.BasePresenterContract;
import com.example.neareventjava.base.BaseViewContract;

public interface RegisterContract {
    interface View extends BaseViewContract {
        void setUsernameError(int error);

        void setEmailError(int error);

        void setPasswordError(int error);

        void setRepeatedPasswordError(int error);

        void onRegisterSuccess(int message);

        void onRegisterFailure(String message);
    }

    interface Presenter extends BasePresenterContract {
        void register(String username, String email, String password, String repeatedPassword);
    }

    interface Interactor {
        void performRegister(String username, String email, String password);
    }

    interface Listener extends BaseListenerContract {
        void onSuccess(int message);

        void onFailure(String message);
    }
}
