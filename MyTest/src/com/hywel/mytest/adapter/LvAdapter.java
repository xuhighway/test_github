package com.hywel.mytest.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.hywel.mytest.R;

import java.util.List;

/**
 * Created by hywel on 16/3/16.
 */
public class LvAdapter<T> extends BaseAdapter {
    private Context context;

    private List<T> mList;

    public LvAdapter(Context context, List<T> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            holder.picImageView = (ImageView) convertView.findViewById(R.id.iv_pic);
            holder.titleTextView = (TextView) convertView.findViewById(R.id.tv_title);
            holder.desTextView = (TextView) convertView.findViewById(R.id.tv_des);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        return null;
    }

    class ViewHolder {
        ImageView picImageView;

        TextView titleTextView;

        TextView desTextView;
    }
}
