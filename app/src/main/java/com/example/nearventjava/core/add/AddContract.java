package com.example.nearventjava.core.add;

import com.example.nearventjava.base.BaseListenerContract;
import com.example.nearventjava.base.BasePresenterContract;
import com.example.nearventjava.base.BaseViewContract;
import com.example.nearventjava.model.UserPlant;

public interface AddContract {
    interface View extends BaseViewContract {
        void setNameError(int error);

        void plantAdded(int message, UserPlant plant);
    }

    interface Presenter extends BasePresenterContract {
        void addPlant(UserPlant plant);
    }

    interface Interactor {
        void performAddPlant(UserPlant plant);
    }

    interface Listener extends BaseListenerContract {
        void onSuccess(int message, UserPlant plant);
        void onFailure(String message);
    }
}