package com.espn.api.motorsports.domain


import com.espn.api.Instance
import com.espn.api.Collection
import com.espn.api.Reference
import com.espn.sports.persistence.motorsports.jpa.RacingPersonRecordEntity

/**
 * The information about the racing event.
 * 
 * @title Event
 */
//@Mixin(RacingPersonRecordEntity)
class RacingPersonSeasonRecord extends Instance {

	public static final String URI_TEMPLATE = BaseSport.BASE_URI_TEMPLATE + '{sport}/' + '{league}/{entityType}/standings'+Instance.ID_TEMPLATE;
	 
	static singular = true
	static order = ['complete','position' ,'pointsBehind','earnings','races','starts','didNotFinish','polePositions','top5','top10','countback']
	
    Short complete;
    
    Short position;
    
    Double pointsBehind;
    
    Double earnings;
    
    Short races;
    
    Short starts;
    
    Short didNotFinish;
    
    Short polePositions;
    
    Short top5;

    Short top10;
    
    String countback;
	
	
}
