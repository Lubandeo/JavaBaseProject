package com.mobile.tandil.javabaseproject.mvp.view;

import android.app.Activity;
import android.app.FragmentManager;
import com.mobile.tandil.javabaseproject.databinding.ActivityMainBinding;
import com.mobile.tandil.javabaseproject.fragment.ParkingDialogFragment;
import com.mobile.tandil.javabaseproject.listener.ListenerDialogFragment;
import com.mobile.tandil.javabaseproject.mvp.contract.ParkingContract;
import com.mobile.tandil.javabaseproject.mvp.view.base.ActivityView;

public class ParkingView extends ActivityView implements ParkingContract.View {

    private final ActivityMainBinding binding;

    public ParkingView(Activity activity, ActivityMainBinding binding) {
        super(activity);
        this.binding = binding;
    }

    public void showDialogFragment(ListenerDialogFragment dialogFragmentListener) {
        ParkingDialogFragment dialog = ParkingDialogFragment.newInstance(dialogFragmentListener);
        FragmentManager fragmentManager = getFragmentManager();
        dialog.show(fragmentManager, ParkingDialogFragment.TAG);
    }

    @Override
    public void showNumberOfParkingAvailable(String numberOfParkingAvailable) {
        binding.textViewMainActivity.setText(numberOfParkingAvailable);
    }
}
