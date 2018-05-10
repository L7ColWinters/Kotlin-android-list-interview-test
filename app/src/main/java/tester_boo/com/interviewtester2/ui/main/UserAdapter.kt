package tester_boo.com.interviewtester2.ui.main

import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import tester_boo.com.interviewtester2.R
import tester_boo.com.interviewtester2.model.User

class UserAdapter() : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    var users: List<User> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder = UserViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.user_list_item, parent,false) as ConstraintLayout)

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]

        if (user.picUri != null) {
            holder.image.setImageURI(user.picUri)
        }
        holder.firstName.text = user.firstName
        holder.lastName.text = user.lastName
    }

    class UserViewHolder(layout: ConstraintLayout) : RecyclerView.ViewHolder(layout) {
        var image: ImageView = layout.findViewById(R.id.profilePic)
        var firstName: TextView = layout.findViewById(R.id.firstName)
        var lastName: TextView = layout.findViewById(R.id.lastName)
    }
}