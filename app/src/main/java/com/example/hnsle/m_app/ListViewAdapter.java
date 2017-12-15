package com.example.hnsle.m_app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by hansol on 2017-12-13.
 */

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ListViewItemMt> listViewItemList = new ArrayList<ListViewItemMt>();

    public ListViewAdapter(){}

    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_mt_data, parent, false);
        }
        //멤버 목록//
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageView);
        TextView mtNameTextView = (TextView) convertView.findViewById(R.id.textView2);
        TextView dateTextView = (TextView) convertView.findViewById(R.id.textView3);
        TextView routeDistTextView = (TextView) convertView.findViewById(R.id.textView4);
        TextView timeTextView = (TextView) convertView.findViewById(R.id.textView5);

        ListViewItemMt listViewItem = listViewItemList.get(position);

        iconImageView.setImageDrawable(listViewItem.getIconDrawable());
        mtNameTextView.setText(listViewItem.getMtName());
        dateTextView.setText(listViewItem.getDate());
        routeDistTextView.setText(listViewItem.getRouteDist());
        timeTextView.setText(listViewItem.getTime());

        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position);
    }

    //아이템 추가
    public void addItem(Drawable icon, String mtName, String date, String routeDist, String time) {
        ListViewItemMt item = new ListViewItemMt();

        item.setIconDrawable(icon);
        item.setMtName(mtName);
        item.setDate(date);
        item.setRouteDist(routeDist);
        item.setTime(time);
        listViewItemList.add(item);
    }
}
