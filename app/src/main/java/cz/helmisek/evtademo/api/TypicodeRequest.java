package cz.helmisek.evtademo.api;

import java.util.List;

import cz.helmisek.evtademo.entity.UserEntity;
import retrofit2.Response;
import retrofit2.http.GET;
import rx.Observable;


/**
 * Created by Jirka Helmich on 22.04.16.
 */
public interface TypicodeRequest
{
	@GET(ApiConfig.USERS)
	Observable<Response<List<UserEntity>>> getUsers();
}
