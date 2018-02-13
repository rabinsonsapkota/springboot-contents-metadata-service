package com.springboot.restful.disneytitlesmetadata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.springboot.restful.disneytitlesmetadata.model.Bonus;
import com.springboot.restful.disneytitlesmetadata.json.ContentsMetadata;
import com.springboot.restful.disneytitlesmetadata.model.Episode;
import com.springboot.restful.disneytitlesmetadata.model.Feature;
import com.springboot.restful.disneytitlesmetadata.json.FeatureContent;
import com.springboot.restful.disneytitlesmetadata.model.Season;
import com.springboot.restful.disneytitlesmetadata.json.TVContent;
import com.springboot.restful.disneytitlesmetadata.model.TVSeries;

@Service
public class ContentsMetadataServiceImpl implements ContentsMetadaService {

	List<ContentsMetadata>  contentsMetadataList;
	List<FeatureContent>  featureContentsMetadata;;
	List<TVContent>  tvContentsMetadata;
	
	@Override
	public List<ContentsMetadata> getContentsMetadata() {
		return contentsMetadataList;
	}

	//create -- hate hard coding
	@Override
	public void createContentsMetadata() {
		
		contentsMetadataList = new ArrayList<ContentsMetadata>();
		featureContentsMetadata = new ArrayList<FeatureContent>();
		tvContentsMetadata = new ArrayList<TVContent>();
		//Frozen
		Bonus frozenBonus1 = new Bonus("bonus","Breaking the Ice","Get to know frozen from the snowy ground up as the filmmakers and songwriters discuss the story's roots and inspiration; the joys of animating olaf, the little snowman with the sunny personality; and the creation of those amazing songs.","15 min");
		Bonus frozenBonus2 = new Bonus("bonus","Deleted Scene: Meet Kristoff 2 - Introduction By Directors","Kristoff goes mountain climbing with a friend. With an introduction by directors chris buck and jennifer lee.","13 min");
		
		List<Bonus> frozenBonuses = new ArrayList<Bonus>();
		frozenBonuses.add(frozenBonus1);
		frozenBonuses.add(frozenBonus2);
		
		Feature frozenFeature = new Feature("Feature","Frozen","Animated feature. Fearless optimist, the Princess Anna, sets off on an epic journey—teaming up with rugged mountain man, Kristoff, and his loyal reindeer Sven—to find her sister Elsa, whose icy powers have trapped the kingdom of Arendelle in eternal winter.", frozenBonuses,"11/27/2013", "102 min");
		
		//ContentsMetadata frozenMetaData = new ContentsMetadata(frozenFeature.getType(),frozenFeature.getName(),frozenFeature.getDescription(),frozenFeature.getTheatricalReleaseDate(),frozenFeature.getDuration(),frozenBonuses);
		FeatureContent featureContent= new FeatureContent(frozenFeature.getType(),frozenFeature.getName(),frozenFeature.getDescription(),frozenFeature.getTheatricalReleaseDate(),frozenFeature.getDuration(),frozenBonuses);
		
		featureContentsMetadata.add(featureContent);
		//contentsMetadata.add(frozenMetaData);
		
		//Cars
		Bonus carsBonus1 = new Bonus("bonus","Animation and Acting","The pixar animators discuss the basic nuts and bolts of transforming hunks of metal and paint into expressive, emotional characters with their own unique personalities.","12 min");
		Bonus carsBonus2 = new Bonus("bonus","Character Design","Lightning mcqueen, doc and the gang may be characters, but they're cars too. The filmmakers explain how getting the design right brings a character to life, and discuss the challenges of chrome, rust, and tire treads.","12 min");

		List<Bonus> carsBonuses = new ArrayList<Bonus>();
		carsBonuses.add(carsBonus1);
		carsBonuses.add(carsBonus2);
		
		Feature carsFeature = new Feature("Feature","Cars","Lightning McQueen, a hotshot rookie race car driven to succeed, discovers that life is about the journey, not the finish line, when he finds himself unexpectedly detoured in the sleepy Route 66 town of Radiator Springs.", carsBonuses,"06/09/2006", "117 min");
		
		FeatureContent carsMetaData = new FeatureContent(carsFeature.getType(),carsFeature.getName(),carsFeature.getDescription(),carsFeature.getTheatricalReleaseDate(),carsFeature.getDuration(),carsBonuses);
		
		featureContentsMetadata.add(carsMetaData);
		
		
		//Star Wars
		List<Bonus> starWarsBonuses = new ArrayList<Bonus>();
	
		Feature starWarsFeature = new Feature("Feature","Star Wars: The Last Jedi","The Last Jedi, the Skywalker saga continues as the heroes of The Force Awakens join the galactic legends in an epic adventure that unlocks age-old mysteries of the Force and shocking revelations of the past.", starWarsBonuses,"12/15/2017", "162 min");
		FeatureContent starWarsMetaData = new FeatureContent(starWarsFeature.getType(),starWarsFeature.getName(),starWarsFeature.getDescription(),starWarsFeature.getTheatricalReleaseDate(),starWarsFeature.getDuration(),starWarsBonuses);	
		featureContentsMetadata.add(starWarsMetaData);
	
		//Season 1 Episode
		Episode epsInTrans = new Episode("Episode","...In Translation","42 min","09/22/2004");
		Episode epsCowboys = new Episode("Episode","All the Best Cowboys Have Daddy Issues","42 min","09/29/2004");
		Episode epsBornToRun = new Episode("Episode","Born to Run","41 min","10/06/2004");
		
		List<Episode> season1Episodes = new ArrayList<Episode>();
		season1Episodes.add(epsInTrans);
		season1Episodes.add(epsCowboys);
		season1Episodes.add(epsBornToRun);
	
		Season season1 = new Season("Season","Season1",season1Episodes);
		
		//Season 2 Episode
		Episode epsAndFound = new Episode("Episode","...And Found","42 min","09/21/2005");
		Episode eps23rdPsalm = new Episode("Episode","23rd Psalm, The","43 min","09/28/2005");
		Episode epsNotKnown = new Episode("Episode","?","42 min","10/05/2005");
		
		List<Episode> season2Episodes = new ArrayList<Episode>();
		season2Episodes.add(epsAndFound);
		season2Episodes.add(eps23rdPsalm);
		season2Episodes.add(epsNotKnown);
		
		Season season2 = new Season("Season","Season2",season2Episodes);
		
		List<Season> seasons = new ArrayList<Season>();
		seasons.add(season1);
		seasons.add(season2);
		
		
		TVSeries lostTvSeries = new TVSeries("TV Series","Lost","A plane crashes on a Pacific island, and the 48 survivors, stripped of everything, scavenge what they can from the plane for their survival. Some panic; some pin their hopes on rescue. The band of friends, family, enemies, and strangers must work together against the cruel weather and harsh terrain.","09/22/2004",seasons);
		
		
		TVContent lostTvSeriesMetaData = new TVContent(lostTvSeries.getType(),lostTvSeries.getName(),lostTvSeries.getReleaseDate(),lostTvSeries.getDescription(),seasons);
		
		tvContentsMetadata.add(lostTvSeriesMetaData);
		
		ContentsMetadata contentsMetadata = new ContentsMetadata(featureContentsMetadata, tvContentsMetadata);
		
		contentsMetadataList.add(contentsMetadata);
		
	}

	
	//updating only Feature and TVContents
	@Override
	public void updateContentsMetadata(String titleType, ContentsMetadata contentsMetadata) {
		
		List<FeatureContent> featureContentsMetadataByType = new ArrayList<FeatureContent>();
		List<TVContent> tvContentsMetadataByType = new ArrayList<TVContent>();
		
		//get all contentsMetadata by titleType
		List<Object> contentsMetadataTypeToBeUpdated = getContentsMetadataByType(titleType);
		
		if(titleType.equalsIgnoreCase("Feature")) {
			for(Object obj : contentsMetadataTypeToBeUpdated) {
				//add all contentsMetadata retrieve based on titleType
				featureContentsMetadataByType.add((FeatureContent) obj);
			}
			//add contentsMetadata that needs to be updated
			featureContentsMetadataByType.addAll(contentsMetadata.getFeatureContents());
			
		}else if(titleType.equalsIgnoreCase("TV Series")) {
			for(Object obj : contentsMetadataTypeToBeUpdated) {
				tvContentsMetadataByType.add((TVContent) obj);
			}
			tvContentsMetadataByType.addAll(contentsMetadata.getTvContents());
			
		}
		
		//added the updated contentsMetadata
		ContentsMetadata updatedContentsMetadata = new ContentsMetadata(contentsMetadataList.get(0).getFeatureContents(),tvContentsMetadataByType);
		contentsMetadataList.clear();
		contentsMetadataList.add(updatedContentsMetadata);
		
	}

	//Deleting only Feature and TVContents
	@Override
	public void deleteContentsMetadata(String titleType, ContentsMetadata contentsMetadata) {
		List<FeatureContent> featureContentsMetadataByType = new ArrayList<FeatureContent>();
		List<TVContent> tvContentsMetadataByType = new ArrayList<TVContent>();
		
		//get all contentsMetadata by titleType
		List<Object> contentsMetadataType = getContentsMetadataByType(titleType);
		
		if(titleType.equalsIgnoreCase("Feature")) {
			for(Object obj : contentsMetadataType) {
				//add all contentsMetadata retrieve based on titleType
				featureContentsMetadataByType.add((FeatureContent) obj);
			}
			//remove contentsMetadata that needs to be deleted
			featureContentsMetadataByType.removeAll(contentsMetadata.getFeatureContents());
			
		}else if(titleType.equalsIgnoreCase("TV Series")) {
			for(Object obj : contentsMetadataType) {
				tvContentsMetadataByType.add((TVContent) obj);
			}
			tvContentsMetadataByType.removeAll(contentsMetadata.getTvContents());
		}
		
		//deleted the contentsMetadata
		ContentsMetadata contentsMetadataAfterDelete = new ContentsMetadata(featureContentsMetadataByType,contentsMetadataList.get(0).getTvContents());
		contentsMetadataList.clear();
		contentsMetadataList.add(contentsMetadataAfterDelete);
	}

	//delete all contentsMetadata
	@Override
	public void deleteContentsMetadata() {
		contentsMetadataList.clear();
	}

	//retrieve contentsMetadata by Title Type
	@Override
	public List<Object> getContentsMetadataByType(String titleType) {
		
		List<Object> contentsMetadataByType = new ArrayList<>();
		
		List<FeatureContent> featureContentsMetadataByType = new ArrayList<FeatureContent>();
		List<TVContent> tvContentsMetadataByType = new ArrayList<TVContent>();
		
		List<Bonus> bonusMetadataByType = new ArrayList<Bonus>();
		
		List<Season> seasonsMetadataByType = new ArrayList<Season>();
		
		List<Episode> episodesMetadataByType = new ArrayList<Episode>();
		
		
		for(ContentsMetadata contentsMetadata : contentsMetadataList) {
			
				if(titleType.equalsIgnoreCase("Feature")) {
						if(titleType.equalsIgnoreCase(contentsMetadata.getFeatureContents().get(0).getType())) {
							contentsMetadataByType.addAll(contentsMetadata.getFeatureContents());
						}
						
				}else if(titleType.equalsIgnoreCase("bonus")) {
						if(contentsMetadata.getFeatureContents()!=null && contentsMetadata.getFeatureContents().size() >=1 ) {
							featureContentsMetadataByType = contentsMetadata.getFeatureContents();
							 
							for(FeatureContent featureContent : featureContentsMetadataByType) {
								if(featureContent.getBonuses()!=null && featureContent.getBonuses().size() >=1 ) {
									if(titleType.equalsIgnoreCase(featureContent.getBonuses().get(0).getType())) {
										bonusMetadataByType.addAll(featureContent.getBonuses());
									}
								}
							}
							contentsMetadataByType.add(bonusMetadataByType);
						}
					 	
				}else if(titleType.equalsIgnoreCase("TV Series")) {
					if(titleType.equalsIgnoreCase(contentsMetadata.getTvContents().get(0).getType())) {
						contentsMetadataByType.addAll(contentsMetadata.getTvContents());
					}
					
				}else if(titleType.equalsIgnoreCase("Season")) {
					
					tvContentsMetadataByType =   contentsMetadataList.get(0).getTvContents();
					for(TVContent tvContent : tvContentsMetadataByType) {
						if(tvContent.getSeasons()!=null && tvContent.getSeasons().size() >=1 ) {
							if(titleType.equalsIgnoreCase(tvContent.getSeasons().get(0).getType())) {
								seasonsMetadataByType.addAll(tvContent.getSeasons());
							}
						}
					}
					contentsMetadataByType.add(seasonsMetadataByType);
					
				}else if(titleType.equalsIgnoreCase("Episode")) {
					tvContentsMetadataByType =   contentsMetadataList.get(0).getTvContents();
					for(TVContent tvContent : tvContentsMetadataByType) {
						if(tvContent.getSeasons()!=null && tvContent.getSeasons().size() >=1 ) {
							List<Season> seasons = tvContent.getSeasons();
							for(Season season : seasons) {
								if(season.getEpisodes()!=null && season.getEpisodes().size() >=1) {
										if(titleType.equalsIgnoreCase(season.getEpisodes().get(0).getType())) {
											episodesMetadataByType.addAll(season.getEpisodes());
									}
								}
							}
						}
					
					}
					contentsMetadataByType.add(episodesMetadataByType);
				}
			
			}
				
		return contentsMetadataByType;
	}

}
