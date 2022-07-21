package com.mobile.tandil.javabaseproject.mvp.contract;

public interface ParkingContract {

    interface Model {
        int getParkingAvailable();
        void setParkingAvailable(int parkingAvailable);
    }

    interface View {
        void showNumberOfParkingAvailable(String numberOfParking);
    }

    interface Presenter {
        void onShowButtonPressed();
    }
}

