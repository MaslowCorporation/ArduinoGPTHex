Spinner spinnerBoard = findViewById(R.id.spinner_board);
ArrayAdapter<Boards> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Boards.values());
spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinnerBoard.setAdapter(spinnerAdapter);
