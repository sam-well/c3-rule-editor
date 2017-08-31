require 'java'
require 'swt'
require_relative 'csv_helper'

module C3DataEditor
  module GUI
    @@page_num = -1

    def self.main
      display = Swt::Widgets::Display.new
      shell = Swt::Widgets::Shell.new(display)
      shell.set_text('C3 Data Editor')
      shell.set_bounds(10, 10, 1000, 800)
      header = Swt::Widgets::Label.new(shell, Swt::SWT::NONE)
      header.set_text("Caesar 3 Data Editor\nby Sam Rodriguez")
      header.set_bounds(20, 10, 200, 30)
      header.pack

      # create the composite that the pages will share
      content_panel = Swt::Widgets::Composite.new(shell, Swt::SWT::BORDER)
      content_panel.set_bounds(100, 60, 900, 700)
      layout = Swt::Custom::StackLayout.new
      content_panel.set_layout(layout)

      # create the first page's content
      page0 = Swt::Widgets::Composite.new(content_panel, Swt::SWT::NONE)
      page0.set_layout(Swt::Layout::GridLayout.new)
      build_general_table(page0)

      # create the second page's content
      page1 = Swt::Widgets::Composite.new(content_panel, Swt::SWT::NONE)
      page1.set_layout(Swt::Layout::GridLayout.new)
      build_housing_table(page1)

      # create the button that will switch between the pages
      general_buildings_button = Swt::Widgets::Button.new(shell, Swt::SWT::PUSH)
      general_buildings_button.set_text("General\nBuildings")
      general_buildings_button.set_bounds(10, 60, 80, 42)
      handle_general_buildings_event = ->(event) do
        layout.topControl = page0
        content_panel.layout
      end
      general_buildings_button.add_listener(Swt::SWT::Selection,
                                            handle_general_buildings_event)

      housing_button = Swt::Widgets::Button.new(shell, Swt::SWT::PUSH)
      housing_button.set_text('Housing')
      housing_button.set_bounds(10, 105, 80, 25)
      handle_housing_event = ->(event) do
        layout.topControl = page1
        content_panel.layout
      end
      housing_button.add_listener(Swt::SWT::Selection, handle_housing_event)

      shell.open
      until shell.is_disposed
        begin
          display.sleep unless display.read_and_dispatch
        rescue => e
          puts e.backtrace
          raise
        end
      end
      display.dispose
    end

    private_class_method def self.build_general_table(shell)
      table_header = Swt::Widgets::Label.new(shell, Swt::SWT::NONE)
      table_header.text = 'General Buildings'

      table = Swt::Widgets::Table.new(shell, Swt::SWT::MULTI | Swt::SWT::BORDER | Swt::SWT::FULL_SELECTION)
      table.setLinesVisible(true)
      table.setHeaderVisible(true)
      data = Swt::Layout::GridData.new(Swt::SWT::FILL, Swt::SWT::FILL, true, true)
      data.heightHint = 200
      table.setLayoutData(data)

      titles = ["Building ID", 'Building Name', 'Building Cost',
                'Initial Desirability', 'Desirability Step',
                'Desirability Step Size', 'Max Desirability Range',
                'Employees Needed']
      titles.count.times do |i|
        column = Swt::Widgets::TableColumn.new(table, Swt::SWT::NONE)
        column.setText(titles[i])
        table.getColumn(i).pack
      end

      general_buildings = CSVHelper.get_general_buildings
      general_buildings.each do |building|
        item = Swt::Widgets::TableItem.new(table, Swt::SWT::NONE)
        item.setText(0, building[:building_id])
        item.setText(1, building[:building_name])
        item.setText(2, building[:building_config][:building_cost])
        item.setText(3, building[:building_config][:initial_desirability])
        item.setText(4, building[:building_config][:desirability_step])
        item.setText(5, building[:building_config][:desirability_step_size])
        item.setText(6, building[:building_config][:max_desirability_range])
        item.setText(7, building[:building_config][:employees_needed])
      end

      titles.count.times do |i|
        table.getColumn(i).pack
      end
    end

    private_class_method def self.build_housing_table(shell)
      table_header = Swt::Widgets::Label.new(shell, Swt::SWT::NONE)
      table_header.text = 'Housing'

      table = Swt::Widgets::Table.new(shell, Swt::SWT::MULTI | Swt::SWT::BORDER | Swt::SWT::FULL_SELECTION)
      table.setLinesVisible(true)
      table.setHeaderVisible(true)
      data = Swt::Layout::GridData.new(Swt::SWT::FILL, Swt::SWT::FILL, true, true)
      data.heightHint = 200
      table.setLayoutData(data)

      titles = ['Building Name', 'Desirability Devolve Level',
                'Desirability Evolve Level', 'Entertainment Needed',
                'Water Needed', 'Temples Needed Nearby', 'Education Needed',
                'Market Access', 'Barber Access', 'Bath Access',
                'Foods Required', 'Pottery Required', 'Oil Required',
                'Furniture Required', 'Wines Required', 'Crime Increment',
                'Crime Base', 'Prosperity Cap', 'Population Limit',
                'Tax Multiplier']
      titles.count.times do |i|
        column = Swt::Widgets::TableColumn.new(table, Swt::SWT::NONE)
        column.setText(titles[i])
        table.getColumn(i).pack
      end

      housing_buildings = CSVHelper.get_housing
      housing_buildings.each do |building|
        item = Swt::Widgets::TableItem.new(table, Swt::SWT::NONE)
        item.setText(0, building[:building_name])
        item.setText(1, building[:building_config][:desirability_devolve_level])
        item.setText(2, building[:building_config][:desirability_evolve_level])
        item.setText(3, building[:building_config][:entertainment_needed])
        item.setText(4, building[:building_config][:water_needed])
        item.setText(5, building[:building_config][:temples_needed_nearby])
        item.setText(6, building[:building_config][:education_needed])
        item.setText(7, building[:building_config][:market_access])
        item.setText(8, building[:building_config][:barber_access])
        item.setText(9, building[:building_config][:bath_access])
        item.setText(10, building[:building_config][:foods_required])
        item.setText(11, building[:building_config][:pottery_required])
        item.setText(12, building[:building_config][:oil_required])
        item.setText(13, building[:building_config][:furniture_required])
        item.setText(14, building[:building_config][:wines_required])
        item.setText(15, building[:building_config][:crime_increment])
        item.setText(16, building[:building_config][:crime_base])
        item.setText(17, building[:building_config][:prosperity_cap])
        item.setText(18, building[:building_config][:population_limit])
        item.setText(19, building[:building_config][:tax_multiplier])
      end

      titles.count.times do |i|
        table.getColumn(i).pack
      end
    end
  end
end

if __FILE__ == $0
  C3DataEditor::GUI.main
end

