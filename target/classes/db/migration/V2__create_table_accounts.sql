CREATE TABLE public.accounts
(
    id integer NOT NULL DEFAULT nextval('accounts_id_seq'::regclass),
    city character varying(255) COLLATE pg_catalog."default",
    first_name character varying(255) COLLATE pg_catalog."default",
    gender character varying(255) COLLATE pg_catalog."default",
    last_name character varying(255) COLLATE pg_catalog."default",
    username character varying(255) COLLATE pg_catalog."default",
    profile_id integer NOT NULL DEFAULT nextval('accounts_profile_id_seq'::regclass),
    CONSTRAINT accounts_pkey PRIMARY KEY (id),
    CONSTRAINT uk_8vhius8eltgd7r0aea2yt85oq UNIQUE (profile_id),
    CONSTRAINT fk84pcs8ra4bmvt5ev1x5ao4aaq FOREIGN KEY (profile_id)
        REFERENCES public.profiles (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fksk6ftfb9wdc99uxpps1dgd39n FOREIGN KEY (id)
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
