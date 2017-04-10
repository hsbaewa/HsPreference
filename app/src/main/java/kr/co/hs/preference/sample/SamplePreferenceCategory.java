package kr.co.hs.preference.sample;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.TextView;

import kr.co.hs.preference.HsPreferenceCategory;

/**
 * 생성된 시간 2017-02-08, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsPreference
 * 패키지명 : kr.co.hs.preference.sample
 */

public class SamplePreferenceCategory extends HsPreferenceCategory {
    public SamplePreferenceCategory(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public SamplePreferenceCategory(Context context) {
        super(context);
    }

    public SamplePreferenceCategory(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SamplePreferenceCategory(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onBindTitleTextView(TextView textViewTitle) {
        textViewTitle.setTextColor(ContextCompat.getColor(getContext(), R.color.colorRed500));
    }
}
