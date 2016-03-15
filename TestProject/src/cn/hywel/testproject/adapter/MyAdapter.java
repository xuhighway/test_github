
package cn.hywel.testproject.adapter;

import java.util.List;

import android.content.Context;

public class MyAdapter<T> extends BasicAdapter<T> {

    public MyAdapter(List<T> mList, Context mContext) {
        super(mList, mContext);
    }

}
