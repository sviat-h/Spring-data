CREATE DATABASE profiles_hw_19
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.UTF-8'
    LC_CTYPE = 'en_US.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


    CREATE TABLE public.accounts
    (
        id integer NOT NULL DEFAULT nextval('accounts_id_seq'::regclass),
        city character varying(255) COLLATE pg_catalog."default",
        first_name character varying(255) COLLATE pg_catalog."default",
        gender character varying(255) COLLATE pg_catalog."default",
        last_name character varying(255) COLLATE pg_catalog."default",
        profile_id integer NOT NULL,
        username character varying(255) COLLATE pg_catalog."default",
        CONSTRAINT accounts_pkey PRIMARY KEY (id),
        CONSTRAINT uk_8vhius8eltgd7r0aea2yt85oq UNIQUE (profile_id),
        CONSTRAINT fk84pcs8ra4bmvt5ev1x5ao4aaq FOREIGN KEY (profile_id)
            REFERENCES public.profiles (id) MATCH SIMPLE
            ON UPDATE NO ACTION
            ON DELETE NO ACTION
    )
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

    ALTER TABLE public.accounts
        OWNER to postgres;



        CREATE TABLE public.profiles
        (
            id integer NOT NULL DEFAULT nextval('profiles_id_seq'::regclass),
            company character varying(255) COLLATE pg_catalog."default",
            department character varying(255) COLLATE pg_catalog."default",
            job_title character varying(255) COLLATE pg_catalog."default",
            skill character varying(255) COLLATE pg_catalog."default",
            CONSTRAINT profiles_pkey PRIMARY KEY (id)
        )
        WITH (
            OIDS = FALSE
        )
        TABLESPACE pg_default;

        ALTER TABLE public.profiles
            OWNER to postgres;
