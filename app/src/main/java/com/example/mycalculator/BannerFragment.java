package com.example.mycalculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import net.pubnative.lite.sdk.views.HyBidBannerAdView;
import net.pubnative.lite.sdk.views.PNAdView;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class BannerFragment extends Fragment {
    String Zone_Id = "2";
    private HyBidBannerAdView mBanner;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_interstitial, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBanner = view.findViewById(R.id.hybid_banner);


         loadBanner();
    }

    private void loadBanner() {
        mBanner.load(Zone_Id, new PNAdView.Listener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdLoadFailed(Throwable error) {

            }

            @Override
            public void onAdImpression() {

            }

            @Override
            public void onAdClick() {

            }
        });
    }
}