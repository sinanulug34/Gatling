import io.gatling.core.Predef.constantUsersPerSec
import io.gatling.core.Predef.{Simulation, _}
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class MerchantSimulation extends Simulation {
	val httpConf = http.baseUrl(Config.baseURL)
	val getAllMerchantExec = GetAllMerchantScenario.getAllMerchant
		.inject(constantUsersPerSec(1) during (20))

	val createMerchant = GetAllMerchantScenario.createMerchant
		.inject(constantUsersPerSec(2) during (1000))

	setUp(getAllMerchantExec)
}
