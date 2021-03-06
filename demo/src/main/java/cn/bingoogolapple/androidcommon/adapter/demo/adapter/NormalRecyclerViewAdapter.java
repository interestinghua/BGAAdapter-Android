package cn.bingoogolapple.androidcommon.adapter.demo.adapter;

import android.content.Context;
import android.net.Uri;

import com.facebook.drawee.view.SimpleDraweeView;

import cn.bingoogolapple.androidcommon.adapter.BGARecyclerViewAdapter;
import cn.bingoogolapple.androidcommon.adapter.BGAViewHolderHelper;
import cn.bingoogolapple.androidcommon.adapter.demo.R;
import cn.bingoogolapple.androidcommon.adapter.demo.mode.NormalModel;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:15/5/22 16:31
 * 描述:
 */
public class NormalRecyclerViewAdapter extends BGARecyclerViewAdapter<NormalModel> {
    public NormalRecyclerViewAdapter(Context context) {
        super(context, R.layout.item_normal);
    }

    @Override
    public void setItemChildListener(BGAViewHolderHelper viewHolderHelper) {
        viewHolderHelper.setItemChildClickListener(R.id.tv_item_normal_delete);
        viewHolderHelper.setItemChildLongClickListener(R.id.tv_item_normal_delete);
    }

    @Override
    public void fillData(BGAViewHolderHelper viewHolderHelper, int position, NormalModel model) {
        viewHolderHelper.setText(R.id.tv_item_normal_title, model.title).setText(R.id.tv_item_normal_detail, model.detail);
        SimpleDraweeView avatorSdv = viewHolderHelper.getView(R.id.sdv_item_normal_avator);
        avatorSdv.setImageURI(Uri.parse(model.avatorPath));
    }
}