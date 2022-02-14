package com.zhangyi.car.ui.adapter;

import android.content.Context;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.zhangyi.car.R;
import com.zhangyi.car.http.glide.GlideApp;
import com.zhpan.bannerview.BaseBannerAdapter;
import com.zhpan.bannerview.BaseViewHolder;
import com.zhpan.bannerview.utils.BannerUtils;

/**
 * 首页轮播图
 */
public class HomeBannerAdapter extends BaseBannerAdapter {
    private Context mContext;

    public HomeBannerAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    protected void bindData(BaseViewHolder holder, Object data, int position, int pageSize) {
        GlideApp.with(mContext)
                .load(data.toString())
                .transform(new MultiTransformation<>(new CenterCrop(), new RoundedCorners(BannerUtils.dp2px(10))))
                .into((ImageView) holder.findViewById(R.id.banner_image));
    }

    @Override
    public int getLayoutId(int viewType) {
        return R.layout.item_banner_home;
    }

}
