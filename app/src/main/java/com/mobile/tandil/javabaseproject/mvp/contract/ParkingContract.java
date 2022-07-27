package com.mobile.tandil.javabaseproject.mvp.contract;

import com.mobile.tandil.javabaseproject.listener.ListenerDialogFragment;

public interface ParkingContract {

    interface Model {
        int getParkingAvailable();

        void setParkingAvailable(int parkingAvailable);
    }

    interface View {
        void showDialogFragment(ListenerDialogFragment dialogFragmentListener);

        void showNumberOfParkingAvailable(String numberOfParking);
    }

    interface Presenter {
        void onShowButtonPressed(ListenerDialogFragment dialogFragmentListener);

        void listenParkingAvailable(String parkingAvailable);
    }
}

