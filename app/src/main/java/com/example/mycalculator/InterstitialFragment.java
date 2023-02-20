package com.example.mycalculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;
import net.pubnative.lite.sdk.views.HyBidBannerAdView;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class InterstitialFragment extends Fragment {

    private HyBidBannerAdView mBanner;
    private HyBidInterstitialAd mInterstitial;
    String Zone_Id = "3";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_banner, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBanner = view.findViewById(R.id.hybid_banner);
        loadInterstitial();
    }
    private void loadInterstitial() {
        mInterstitial = new HyBidInterstitialAd(getActivity(),Zone_Id, new HyBidInterstitialAd.Listener() {
            @Override
            public void onInterstitialLoaded() {
                mInterstitial.show();
            }

            @Override
            public void onInterstitialLoadFailed(Throwable error) {

            }

            @Override
            public void onInterstitialImpression() {

            }

            @Override
            public void onInterstitialDismissed() {

            }

            @Override
            public void onInterstitialClick() {

            }
        });
        mInterstitial.load();
    }
}