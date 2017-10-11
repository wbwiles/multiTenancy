# multiTenancy
a proof of concept project to validate multi-sharding behavior.  This is a alternative behavior to AbstractRoutingDataSource.java (Spring) which can't be used because the datasources aren't known until runtime. The shard (partition) key is stored in a control db. 
