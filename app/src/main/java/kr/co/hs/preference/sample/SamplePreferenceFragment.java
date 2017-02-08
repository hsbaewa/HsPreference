package kr.co.hs.preference.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.preference.Preference;
import android.view.ViewGroup;

import kr.co.hs.preference.app.HsPreferenceFragment;
import kr.co.hs.util.Logger;

/**
 * 생성된 시간 2017-02-08, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsPreference
 * 패키지명 : kr.co.hs.preference.sample
 */

public class SamplePreferenceFragment extends HsPreferenceFragment {

    @Override
    public int onPreferencesFromResource(Bundle bundle, String s) {
        return R.xml.settings_sample;
    }

    @Override
    public void onCreateHsPreference(Bundle bundle, String s) {

    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return false;
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        switch (preference.getKey()){
            case "Setting1":{
                Logger.d("a");
                break;
            }
            case "Setting2":{
                Logger.d("a");
                break;
            }
        }
        return false;
    }
}
