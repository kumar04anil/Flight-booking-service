--ALTER TABLE public.flight ALTER COLUMN flight_time TYPE timestamp USING ('2000-1-1'::date + flight_time);