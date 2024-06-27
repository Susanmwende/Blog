package com.akirachix.mybloggingsite

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class MyMovieAdapter (var bloglist:List<MyBlog>):
    RecyclerView.Adapter<AuthorsViewsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorsViewsHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.blog_list_view,parent, false)
        return AuthorsViewsHolder(itemView)

    }

    override fun onBindViewHolder(holder: AuthorsViewsHolder, position: Int) {
        val blog = bloglist[position]
        holder.tvauthorName.text=blog.authorName
        holder.tvdate.text = blog.datepublished
        holder.tvblogTitle.text = blog.blogtitle
    }

    override fun getItemCount(): Int {
        return bloglist.size
    }
}
class AuthorsViewsHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvauthorName = itemView.findViewById<TextView>(R.id.tvauthorName)
    var tvdate = itemView.findViewById<TextView>(R.id.tvdate)
    var tvblogTitle= itemView.findViewById<TextView>(R.id.tvblogTitle)

}