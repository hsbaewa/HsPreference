package kr.co.hs.preference.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;

import kr.co.hs.app.HsActivity;

/**
 * 생성된 시간 2017-02-08, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsPreference
 * 패키지명 : kr.co.hs.preference.sample
 */

public class SampleActivity extends HsActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.LinearLayoutContents, new SamplePreferenceFragment());
        transaction.commit();

    }
}
