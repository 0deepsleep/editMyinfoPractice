package dasdsa.sdn.editmyinfopractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import dasdsa.sdn.editmyinfopractice.R
import dasdsa.sdn.editmyinfopractice.datas.PizzaStore

class PizzaStoreAdapter(val mContext: Context, resId:Int, val mList:ArrayList<PizzaStore>) : ArrayAdapter<PizzaStore>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {

        }.let {
            tempRow = inf.inflate(R.layout.pizza_store_item, null)
        }

        val row = tempRow!!

//        실제 데이터 반영 코드 작업 필요

        return row
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {

        }.let {
            tempRow = inf.inflate(R.layout.pizza_store_item, null)
        }

        val row = tempRow!!

//        실제 데이터 반영 코드 작업 필요

        return row
    }


}