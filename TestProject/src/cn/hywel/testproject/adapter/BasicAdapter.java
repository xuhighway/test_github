
package cn.hywel.testproject.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class BasicAdapter<T> extends BaseAdapter {
    private List<T> mList;

    private Context mContext;

    public BasicAdapter(List<T> mList, Context mContext) {
        super();
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        return null;
    }
}