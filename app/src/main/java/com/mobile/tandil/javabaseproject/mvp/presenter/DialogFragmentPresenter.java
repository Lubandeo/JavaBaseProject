package com.mobile.tandil.javabaseproject.mvp.presenter;

import com.mobile.tandil.javabaseproject.listener.ListenerDialogFragment;
import com.mobile.tandil.javabaseproject.mvp.contract.DialogFragmentContract;

public class DialogFragmentPresenter implements DialogFragmentContract.Presenter {

    private final DialogFragmentContract.View view;

    public DialogFragmentPresenter(DialogFragmentContract.View view) {
        this.view = view;
    }

    @Override
    public void onPressedInputButton(String parkingAvailable, ListenerDialogFragment listenerDialogFragment) {
        if (parkingAvailable.isEmpty()) {
            view.showInvalidMessage();
        } else {
            view.showParkingAvailable(parkingAvailable, listenerDialogFragment);
        }
    }
}
