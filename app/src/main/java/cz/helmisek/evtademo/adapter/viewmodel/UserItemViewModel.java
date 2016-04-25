package cz.helmisek.evtademo.adapter.viewmodel;

import android.util.Log;
import android.view.View;

import cz.helmisek.evtademo.databinding.UserItemBinding;
import cz.helmisek.evtademo.entity.UserEntity;
import cz.helmisek.evtalibrary.viewmodel.BaseAdapterViewModel;


/**
 * Created by Jirka Helmich on 22.04.16.
 */
public class UserItemViewModel extends BaseAdapterViewModel<UserEntity, UserItemBinding> implements View.OnLongClickListener
{
	public UserItemViewModel(UserEntity entity, UserItemBinding binding, int position)
	{
		super(entity, binding, position);

		getBinding().getRoot().setOnLongClickListener(this);

		getBinding().userItemTitle.setText(entity.getName());
	}


	@Override
	public void onItemClick(View v)
	{
		Log.v("Title", getDataObject().getName());
	}


	@Override
	public boolean onLongClick(View v)
	{
		Log.v("Username", getDataObject().getUsername());
		return true;
	}
}
