import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.Predef.{StringBody, constantUsersPerSec, global, scenario, _}
import io.gatling.http.Predef.{http, status, _}

object GetAllMerchantRequest {
	val getMerchants = exec(http("Get Merchants")
		.get(Config.baseURL + "/merchants"))
	val createMerchant = exec(http("Create Merchants")
		.post(Config.baseURL + "/merchants")
		.body(RawFileBody("src/test/scala/resources/createMerchant.json"))
		.asJson)

}