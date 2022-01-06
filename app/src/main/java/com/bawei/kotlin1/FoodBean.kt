package com.bawei.kotlin1

/**
 * @ClassName:      FoodBean$
 * @Description:    java类作用描述
 * @Author:         author
 * @CreateDate:     2022/1/6$
 * @UpdateUser:     孙赵晋
 * @UpdateTime:     7:58$
 * @UpdateRemark:   更新内容
 * @Version:        1.0
 */
class FoodBean {

    var data: List<DataBean>? = null

    class DataBean {
        var id: String? = null
        var title: String? = null
        var pic: String? = null
        var collect_num: String? = null
        var food_str: String? = null
        var num = 0
    }
}