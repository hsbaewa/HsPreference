package kr.co.hs.preference;

import android.content.Context;
import android.support.v7.preference.PreferenceCategory;
import android.support.v7.preference.PreferenceViewHolder;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 생성된 시간 2017-02-08, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsPreference
 * 패키지명 : kr.co.hs.preference
 */

public abstract class HsPreferenceCategory extends PreferenceCategory{
    TextView mTextViewTitle;

    public HsPreferenceCategory(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public HsPreferenceCategory(Context context) {
        super(context);
    }

    public HsPreferenceCategory(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HsPreferenceCategory(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        mTextViewTitle = (TextView) holder.findViewById(android.R.id.title);
        if(mTextViewTitle != null)
            onBindTitleTextView(mTextViewTitle);
        super.onBindViewHolder(holder);
    }


    protected abstract void onBindTitleTextView(TextView textViewTitle);
}
