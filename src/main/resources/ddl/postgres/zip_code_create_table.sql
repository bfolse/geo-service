-- Table: public.zip_code

-- DROP TABLE public.zip_code;

CREATE TABLE public.zip_code
(
  id bigint NOT NULL,
  accuracy integer NOT NULL,
  city_code character varying(255),
  city_name character varying(255),
  county_code character varying(255),
  county_name character varying(255),
  latitude double precision NOT NULL,
  longitude double precision NOT NULL,
  place_name character varying(255),
  postal_code character varying(255),
  state_code character varying(255),
  state_name character varying(255),
  CONSTRAINT zip_code_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.zip_code
  OWNER TO postgres;
