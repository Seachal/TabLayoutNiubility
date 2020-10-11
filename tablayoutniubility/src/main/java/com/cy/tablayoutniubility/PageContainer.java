package com.cy.tablayoutniubility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @Description:
 * @Author: cy
 * @CreateDate: 2020/10/7 23:52
 * @UpdateUser:
 * @UpdateDate: 2020/10/7 23:52
 * @UpdateRemark:
 * @Version: 1.0
 */
public abstract class PageContainer {
    protected View view;
    protected Context context;

    public Context getContext() {
        return context;
    }

    public View getView() {
        return view;
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup container);

    public  void onResume(boolean isFirstResume){}

    public  void onStop(){}

    public  void onDestroyView(){}
}
