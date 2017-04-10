package kr.co.hs.preference.sample;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.TextView;

import kr.co.hs.preference.HsPreference;

/**
 * 생성된 시간 2017-04-10, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsPreference
 * 패키지명 : kr.co.hs.preference.sample
 */

public class SamplePreference extends HsPreference {
    public SamplePreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public SamplePreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SamplePreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SamplePreference(Context context) {
        super(context);
    }

    @Override
    protected void onBindTitleTextView(TextView textViewTitle) {
        textViewTitle.setTextColor(ContextCompat.getColor(getContext(), R.color.colorRed500));
    }

    @Override
    protected void onBindSummaryTextView(TextView summary) {
        summary.setTextColor(ContextCompat.getColor(getContext(), R.color.colorRed500));
    }
}
