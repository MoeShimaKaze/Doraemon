package com.cofbro.qian.friend.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cn.leancloud.LCObject
import cn.leancloud.LCUser
import com.cofbro.qian.databinding.ItemFriendListBinding
import com.cofbro.qian.friend.viewholder.UserListContentViewHolder

class UserListAdapter: RecyclerView.Adapter<UserListContentViewHolder<LCObject>>()  {
    private var users = mutableListOf<LCObject>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListContentViewHolder<LCObject> {
        val inflater = LayoutInflater.from(parent.context)
        val binding =  ItemFriendListBinding.inflate(inflater, parent, false)
        return UserListContentViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: UserListContentViewHolder<LCObject>, position: Int) {
        holder.bind(position, users.getOrNull(position))
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(data: List<LCObject>) {
        users = ArrayList(data)
        notifyDataSetChanged()
    }
}