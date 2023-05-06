package com.example.nearventjava.core.discover;

import com.example.nearventjava.base.BaseListenerContract;
import com.example.nearventjava.base.BasePresenterContract;
import com.example.nearventjava.base.BaseViewContract;
import com.example.nearventjava.model.Plant;

import java.util.List;

public interface DiscoverContract {
    interface View extends BaseViewContract {
        void setDiscoverPlantList(List<Plant> plantList);
    }

    interface Presenter extends BasePresenterContract {
        void getAllPlants();

        void getMatchingPlants(String regex);
    }

    interface Interactor {
        void performGetAllPlants();

        void performGetMatchingPlants(String regex);
    }

    interface Listener extends BaseListenerContract {
        void onSuccess(List<Plant> plantList);

        void onFailure(String message);
    }
}
