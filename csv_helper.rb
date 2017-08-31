require 'csv'

module CSVHelper
  def self.get_general_buildings
    buildings = []
    CSV.foreach('data/general_data.txt') do |row|
      building = {
                    building_id: row[0],
                    building_name: row[1],
                    building_config: {
                                      building_cost: row[3],
                                      initial_desirability: row[4],
                                      desirability_step: row[5],
                                      desirability_step_size: row[6],
                                      max_desirability_range: row[7],
                                      employees_needed: row[8],
                                      undetermined1: row[9],
                                      undetermined2: row[10]
                    }
      }
      buildings << building
    end
    buildings
  end

  def self.get_housing
    buildings = []
    CSV.foreach('data/housing_data.txt') do |row|
      building = {
                    building_name: row[0],
                    building_config: {
                                      desirability_devolve_level: row[2],
                                      desirability_evolve_level: row[3],
                                      entertainment_needed: row[4],
                                      water_needed: row[5],
                                      temples_needed_nearby: row[6],
                                      education_needed: row[7],
                                      market_access: row[8],
                                      barber_access: row[9],
                                      bath_access: row[10],
                                      foods_required: row[11],
                                      pottery_required: row[12],
                                      oil_required: row[13],
                                      furniture_required: row[14],
                                      wines_required: row[15],
                                      crime_increment: row[16],
                                      crime_base: row[17],
                                      prosperity_cap: row[18],
                                      population_limit: row[19],
                                      tax_multiplier: row[20]
                    }
      }
      buildings << building
    end
    buildings
  end
end

