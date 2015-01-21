package me.pjq.chinapm25;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by pjq on 1/18/15.
 */
public class ExchangeHistoryListAdapter extends BaseAdapter {
    private ArrayList<PM25Object> dataList = new ArrayList<PM25Object>();
    private Context context;
    private LayoutInflater inflater;

    public ExchangeHistoryListAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);

    }

    public void updateDataList(ArrayList<PM25Object> dataList) {
        this.dataList = dataList;

        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PM25Object object = (PM25Object) getItem(position);

        ViewHolder viewHolder;
        View view = convertView;
        if (null == view) {
            view = inflater.inflate(R.layout.item_pm25, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.update(position, object);


        return view;
    }

    static class ViewHolder {
        TextView time;
        TextView activityName;
        TextView activityOperatorSeller;
        TextView exchangeGiftName;
        TextView exchangeGiftUser;

        ViewHolder(View view) {
            time = (TextView) view.findViewById(R.id.itemTime);
            activityName = (TextView) view.findViewById(R.id.itemActivityName);
            activityOperatorSeller = (TextView) view.findViewById(R.id.itemActivityOperator);
            exchangeGiftName = (TextView) view.findViewById(R.id.itemExchangeGiftName);
            exchangeGiftUser = (TextView) view.findViewById(R.id.itemExchangeGiftUser);
        }

        public void update(int position, PM25Object object) {
            PM25Object itemObject = (PM25Object) object;
            time.setText(new Date().toLocaleString());
            activityOperatorSeller.setText("" + position);
            activityName.setText(itemObject.getCityPingyin());
            exchangeGiftName.setText(itemObject.getCityChinese());
            exchangeGiftUser.setText(itemObject.getPm25());

        }
    }
}
