package kr.co.hs.preference;

import android.content.Context;
import android.support.v7.preference.PreferenceViewHolder;
import android.support.v7.preference.TwoStatePreference;
import android.util.AttributeSet;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * 생성된 시간 2017-06-22, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsPreference
 * 패키지명 : kr.co.hs.preference
 */

public abstract class HsRadioPreference extends TwoStatePreference {

    RadioButton mRadioButton;
    TextView mTextViewTitle;
    TextView mTextViewSummary;

    public HsRadioPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setWidgetLayoutResource(R.layout.layout_radio);
    }

    public HsRadioPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setWidgetLayoutResource(R.layout.layout_radio);
    }

    public HsRadioPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWidgetLayoutResource(R.layout.layout_radio);
    }

    public HsRadioPreference(Context context) {
        super(context);
        setWidgetLayoutResource(R.layout.layout_radio);
    }



    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        mTextViewTitle = (TextView) holder.findViewById(android.R.id.title);
        if(mTextViewTitle != null)
            onBindTitleTextView(mTextViewTitle);
        mTextViewSummary = (TextView) holder.findViewById(android.R.id.summary);
        if(mTextViewSummary != null)
            onBindSummaryTextView(mTextViewSummary);
        mRadioButton = (RadioButton) holder.findViewById(R.id.RadioButton);
        mRadioButton.setChecked(isChecked());
        super.onBindViewHolder(holder);
    }

    @Override
    public void setChecked(boolean checked) {
        super.setChecked(checked);
        if(mRadioButton != null)
            mRadioButton.setChecked(checked);
    }

    protected abstract void onBindTitleTextView(TextView textViewTitle);
    protected abstract void onBindSummaryTextView(TextView summary);
}
