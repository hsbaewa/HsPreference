package kr.co.hs.preference;

import android.content.Context;
import android.support.v7.preference.PreferenceViewHolder;
import android.support.v7.preference.SwitchPreferenceCompat;
import android.util.AttributeSet;
import android.widget.Switch;
import android.widget.TextView;

/**
 * 생성된 시간 2017-04-10, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsPreference
 * 패키지명 : kr.co.hs.preference
 */

public abstract class HsSwitchPreference extends SwitchPreferenceCompat{

    Switch mSwitch;
    TextView mTextViewTitle;
    TextView mTextViewSummary;

    public HsSwitchPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public HsSwitchPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public HsSwitchPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HsSwitchPreference(Context context) {
        super(context);
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        mTextViewTitle = (TextView) holder.findViewById(android.R.id.title);
        if(mTextViewTitle != null)
            onBindTitleTextView(mTextViewTitle);
        mTextViewSummary = (TextView) holder.findViewById(android.R.id.summary);
        if(mTextViewSummary != null)
            onBindSummaryTextView(mTextViewSummary);
        super.onBindViewHolder(holder);
    }

    protected abstract void onBindTitleTextView(TextView textViewTitle);
    protected abstract void onBindSummaryTextView(TextView summary);
}
