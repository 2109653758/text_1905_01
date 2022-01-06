package com.bawei.kotlin1

import android.view.View
import android.widget.ImageView
import com.blankj.utilcode.util.Utils
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

/**
 * @ClassName: MyAdapter$
 * @Description: java类作用描述
 * @Author: author
 * @CreateDate: 2022/1/6$
 * @UpdateUser: 孙赵晋
 * @UpdateTime: 10:22$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */
internal class MyAdapter(data: List<FoodBean.DataBean>?) :
    BaseQuickAdapter<FoodBean.DataBean, BaseViewHolder>(R.layout.item, data) {
    override fun convert(helper: BaseViewHolder, item: FoodBean.DataBean) {
        Glide.with(Utils.getApp()).load(item.pic)
            .into((helper.getView<View>(R.id.img) as ImageView))
        helper.setText(R.id.tv, item.title)
    }
}