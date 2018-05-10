package tester_boo.com.interviewtester2.ui.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.*
import kotlinx.android.synthetic.main.main_fragment.*
import tester_boo.com.interviewtester2.R
import tester_boo.com.interviewtester2.model.User

class MainFragment : Fragment() {

    private val adapter: UserAdapter = UserAdapter()

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setHasOptionsMenu(true)

        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = adapter

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.users.observe(this, Observer<ArrayList<User>>{
            adapter.users = it!!//usually a bad idea
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.user_list_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            R.id.menu_item_add_user -> {
                //Create dialog to add user
            }
            R.id.menu_item_sort_user_first -> {
                //sort the users
            }
            R.id.menu_item_sort_user_last -> {

            }
            R.id.menu_item_sort_user_phone -> {

            }
        }
        return super.onOptionsItemSelected(item)
    }

}
