import io.gatling.core.Predef.scenario

object GetAllMerchantScenario {
	val getAllMerchant = scenario("Get All Merchant")
		.exec(GetAllMerchantRequest.getMerchants)
	val createMerchant = scenario("Create Merchant")
  	.exec(GetAllMerchantRequest.createMerchant)
}